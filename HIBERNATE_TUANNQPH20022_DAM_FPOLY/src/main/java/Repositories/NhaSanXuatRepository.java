package Repositories;

import DomainModels.NhaSanXuat;
import Repositories.InterfaceRepository.INhaSanXuatRepository;
import Utilities.HibernateUtili;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class NhaSanXuatRepository implements INhaSanXuatRepository {

    @Override
    public List<NhaSanXuat> getAllNhaSanXuats() {
        String hql = "From NhaSanXuat";
        try ( Session session = new HibernateUtili().getFACTORY().openSession()) {
            Query query = session.createQuery(hql);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String addNew(NhaSanXuat nhaSanXuat) {
        String check;
        Transaction transaction = null;
        try ( Session session = new HibernateUtili().getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.save(nhaSanXuat);
            check = "THÊM THÀNH CÔNG";
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            check = "THÊM THẤT BẠI";
            transaction.rollback();
        }
        return check;
    }

    @Override
    public String Update(NhaSanXuat nhaSanXuat) {
        String check;
        Transaction transaction = null;
        try ( Session session = new HibernateUtili().getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.saveOrUpdate(nhaSanXuat);
            check = "UPDATE THÀNH CÔNG";
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            check = "UPDATE THẤT BẠI";
            transaction.rollback();
        }
        return check;
    }

    @Override
    public String delete(NhaSanXuat nhaSanXuat) {
        String check;
        Transaction transaction = null;
        try ( Session session = new HibernateUtili().getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            session.delete(nhaSanXuat);
            check = "XÓA THÀNH CÔNG";
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            check = "XÓA THẤT BẠI";
            transaction.rollback();
        }
        return check;
    }
    public static void main(String[] args) {
        NhaSanXuatRepository ns = new NhaSanXuatRepository();
        NhaSanXuat nss = new NhaSanXuat("dsdssd", "dsds");
        ns.addNew(nss);
    }
}
