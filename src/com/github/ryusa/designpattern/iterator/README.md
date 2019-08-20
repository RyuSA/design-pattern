# Iteratorパターン

Classが持つ配列フィールドを順繰りと舐めまわさせて使いたいときに採用するもの


## pros
- 機能としてわかりやすい(慣れてる)


## cons
- なんだろう……サイズが大きくなると線形探索が死ぬとか？
    - サイズが大きいときには使いにくいかもしれない


## 例

> BookShelfにBookの配列が存在し、そのBookを順番に取得したい

MyIteratorInterface：hasNextメソッドとnextメソッドを定義

AggregateInterface：MyIteratorInterfaceを返却するメソッドを定義

Book：本Class

BookShelf：貯蔵する本のイテレータを返却したいのでAggregateInterfaceを実装する

BookShelfIterator：BookShelfをコンストラクタで受取、MyIteratorを実装する


