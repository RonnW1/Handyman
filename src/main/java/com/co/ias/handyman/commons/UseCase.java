package com.co.ias.handyman.commons;

public interface UseCase<Input, Output>{
    Output execute(Input input);
}
