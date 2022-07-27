package diagonalDiff

import java.io.*
import kotlin.Throws
import kotlin.jvm.JvmStatic
import java.util.stream.IntStream
import java.util.function.IntConsumer
import java.util.stream.Collectors
import java.lang.RuntimeException
import java.util.ArrayList
import java.util.stream.Stream

internal object Result {
    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
    fun diagonalDifference(arr: List<List<Int>>): Int {
        // Write your code here
        var psum = 0
        var secSum = 0
        for (i in arr.indices) {
            for (j in arr.indices) {
                if (i == j) {
                    psum += arr[i][j]
                }
                if (i + j == arr.size - 1) {
                    secSum += arr[i][j]
                }
            }
        }
        return Math.abs(psum - secSum)
    }
}

object Solution {
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
        val bufferedWriter = BufferedWriter(FileWriter(System.getenv("OUTPUT_PATH")))
        val n = bufferedReader.readLine().trim { it <= ' ' }.toInt()
        val arr: MutableList<List<Int>> = ArrayList()
        IntStream.range(0, n).forEach { i: Int ->
            try {
                arr.add(
                        Stream.of(*bufferedReader.readLine().replace("\\s+$".toRegex(), "").split(" ".toRegex()).toTypedArray())
                                .map { s: String -> s.toInt() }
                                .collect(Collectors.toList())
                )
            } catch (ex: IOException) {
                throw RuntimeException(ex)
            }
        }
        val result = Result.diagonalDifference(arr)
        bufferedWriter.write(result.toString())
        bufferedWriter.newLine()
        bufferedReader.close()
        bufferedWriter.close()
    }
}