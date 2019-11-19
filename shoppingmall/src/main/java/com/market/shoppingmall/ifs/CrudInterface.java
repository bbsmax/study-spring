package com.market.shoppingmall.ifs;

import com.market.shoppingmall.model.network.Header;

public interface CrudInterface {
    Header create();
    Header read(Long id);
    Header update();
    Header delete(Long id);

}
