package com.example.literalura.service;

public interface IDataConverter { <T> T obtainData(String json, Class<T> anyClass); }
