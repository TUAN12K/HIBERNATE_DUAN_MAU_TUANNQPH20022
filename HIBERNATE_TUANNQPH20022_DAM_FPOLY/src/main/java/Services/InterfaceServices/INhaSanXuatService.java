package Services.InterfaceServices;

import ViewModels.QLNhaSanXuat;
import java.util.List;

public interface INhaSanXuatService {

    List<QLNhaSanXuat> getAllNhaSanXuats();

    String addNew(QLNhaSanXuat qLNhaSanXuat);

    String update(QLNhaSanXuat qLNhaSanXuat);

    String delete(QLNhaSanXuat qLNhaSanXuat);

}
