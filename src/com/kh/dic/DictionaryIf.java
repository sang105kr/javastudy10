package com.kh.dic;

import java.util.List;
import java.util.Map;

public interface DictionaryIf {

  /**
   * @param word
   * @param meaning
   */
  void put(String word, String meaning);

  Map<String, String> findByWord(String word);

  void update(String word, String meaning);

  void delete(String word);

  Map<String, String> list(int howToSort);

  List<String> index(char ch);

  List<Object> statistics();
}
