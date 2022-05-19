package fr.maif.demo.part6.sealed;

public sealed abstract class Quadrilatere implements FormeGeometrique permits Carre, Rectangle{
}
