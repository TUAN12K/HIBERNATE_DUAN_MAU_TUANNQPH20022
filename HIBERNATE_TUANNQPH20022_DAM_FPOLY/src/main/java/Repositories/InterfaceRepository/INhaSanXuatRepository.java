package Repositories.InterfaceRepository;

import DomainModels.NhaSanXuat;
import java.util.List;

public interface INhaSanXuatRepository {

    List<NhaSanXuat> getAllNhaSanXuats();

    String addNew(NhaSanXuat nhaSanXuat);

    String Update(NhaSanXuat nhaSanXuat);

    String delete(NhaSanXuat nhaSanXuat);
}
