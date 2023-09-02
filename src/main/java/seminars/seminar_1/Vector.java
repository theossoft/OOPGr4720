package seminars.seminar_1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Vector {
    private double x;
    private double y;
    private double z;

    /**
     * @return длинна вектора
     * @apiNote метод, вычисляющий длину вектора.
     */
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * @param vector вектор с которым происходит умножениее
     * @return скалярное произведение
     * @apiNote метод, вычисляющий скалярное произведение
     */
    public double scal(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    /**
     * @param vector Принимает в качестве параметра вектор на который делается векторное произведение.
     * @return Новый вектор как векторное произведение.
     */
    public Vector vprod(Vector vector) {
        return new Vector(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }

    /**
     * Метод вычисляющий угол между векторами.
     *
     * @param vector принимается в качестве значения.
     * @return скалярное произведение двух векторов.
     */
    public double angle(Vector vector) {
        return scal(vector) / (length() * vector.length());
    }

    /**
     * Метод сложения двух векторов
     *
     * @param vector который необходимо прибавить к существующему
     * @return новый вектор
     */
    public Vector sum(Vector vector) {
        return new Vector(
                x + vector.x,
                y + vector.y,
                z + vector.z
        );
    }

    /**
     * Метод вычитания двух векторов
     *
     * @param vector который необходимо вычесть
     * @return новый вектор
     */
    public Vector divider(Vector vector) {
        return new Vector(
                x - vector.x,
                y - vector.y,
                z - vector.z
        );
    }
}