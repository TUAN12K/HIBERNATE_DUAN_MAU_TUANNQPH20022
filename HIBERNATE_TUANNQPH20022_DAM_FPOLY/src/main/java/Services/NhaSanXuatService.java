package Services;

import DomainModels.NhaSanXuat;
import Repositories.InterfaceRepository.INhaSanXuatRepository;
import Repositories.NhaSanXuatRepository;
import Services.InterfaceServices.INhaSanXuatService;
import ViewModels.QLNhaSanXuat;
import java.util.ArrayList;
import java.util.List;

public class NhaSanXuatService implements INhaSanXuatService {

    private final INhaSanXuatRepository repository;
    private List<QLNhaSanXuat> lstQLNhaSanXuats;

    public NhaSanXuatService() {
        repository = new NhaSanXuatRepository();
        lstQLNhaSanXuats = new ArrayList<>();
    }

    @Override
    public List<QLNhaSanXuat> getAllNhaSanXuats() {
        lstQLNhaSanXuats = new ArrayList<>();
        var x = repository.getAllNhaSanXuats();
        for (NhaSanXuat nsx : x) {
            lstQLNhaSanXuats.add(new QLNhaSanXuat(nsx.getId(), nsx.getMa(), nsx.getTen()));
        }
        return lstQLNhaSanXuats;
    }

    @Override
    public String addNew(QLNhaSanXuat qLNhaSanXuat) {
        String x = repository.addNew(new NhaSanXuat(qLNhaSanXuat.getMa(), qLNhaSanXuat.getTen()));
        return x;
    }

    @Override
    public String update(QLNhaSanXuat qLNhaSanXuat) {
        String x = repository.Update(new NhaSanXuat(qLNhaSanXuat.getId(), qLNhaSanXuat.getMa(), qLNhaSanXuat.getTen()));
        return x;
    }

    @Override
    public String delete(QLNhaSanXuat qLNhaSanXuat) {
        String x = repository.delete(new NhaSanXuat(qLNhaSanXuat.getId(), qLNhaSanXuat.getMa(), qLNhaSanXuat.getTen()));
        return x;
    }

    public static void main(String[] args) {
        NhaSanXuatService sv = new NhaSanXuatService();
        List<QLNhaSanXuat> lst = sv.getAllNhaSanXuats();
        System.out.println(lst);
    }
}
