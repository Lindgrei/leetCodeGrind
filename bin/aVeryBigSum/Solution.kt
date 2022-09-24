package aVeryBigSum

import java.io.*
import kotlin.Throws
import kotlin.jvm.JvmStatic
import java.util.stream.Collectors
import java.util.stream.Stream

internal object Result {
    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */
    fun aVeryBigSum(ar: List<Long>): Long {
        // Write your code here
        var sum: Long = 0
        for (aLong in ar) {
            sum += aLong
        }
        return sum
    }
}

object Solution {
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
        val bufferedWriter = BufferedWriter(FileWriter(System.getenv("OUTPUT_PATH")))
        val arCount = bufferedReader.readLine().trim { it <= ' ' }.toInt()
        val ar = Stream.of(*bufferedReader.readLine().replace("\\s+$".toRegex(), "").split(" ".toRegex()).toTypedArray())
                .map { s: String -> s.toLong() }
                .collect(Collectors.toList())
        val result = Result.aVeryBigSum(ar)
        bufferedWriter.write(result.toString())
        bufferedWriter.newLine()
        bufferedReader.close()
        bufferedWriter.close()
    }
}