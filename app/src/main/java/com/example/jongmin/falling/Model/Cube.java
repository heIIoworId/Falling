package com.example.jongmin.falling.Model;

/**
 * Created by Jongmin on 2017-01-08.
 */

public class Cube extends Model {
    public Cube(){
        super();
        setVertices(GeometrySet.cubeVertices);
        setNormals(GeometrySet.cubeNormals);
        setBuffer();
        setShader();
    }
}
