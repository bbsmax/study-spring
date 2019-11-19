package com.market.shoppingmall.service;

import com.market.shoppingmall.ifs.CrudInterface;
import com.market.shoppingmall.model.network.Header;
import com.market.shoppingmall.model.network.request.UserApiRequest;
import com.market.shoppingmall.model.network.response.UserApiResponse;
import com.market.shoppingmall.repository.UserRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserApiLogicService implements CrudInterface<UserApiRequest, UserApiResponse> {

    @Autowired
    private UserRepostiory userRepostiory;

    @Override
    public Header<UserApiResponse> create(Header<UserApiRequest> request) {
        return null;
    }

    @Override
    public Header<UserApiResponse> read(Long id) {
        return null;
    }

    @Override
    public Header<UserApiResponse> update(Header<UserApiRequest> request) {
        return null;
    }

    @Override
    public Header delete(Long id) {
        return null;
    }
}
