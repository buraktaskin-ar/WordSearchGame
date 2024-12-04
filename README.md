<h2>Total Time Complexity:</h2>

<ul>
  <li><strong>N</strong> = Number of Words</li>
  <li><strong>L</strong> = Length of Text</li>
</ul>

<h3>Input Reading:</h3>
<p><strong>O(n + L)</strong></p>

<h3>Word Processing:</h3>

<ul>
  <li>Two <code>markWord</code> calls per word:
    <ul>
      <li><strong>2 * O(L) = O(L)</strong></li>
    </ul>
  </li>
  <li>For <strong>N</strong> words:
    <ul>
      <li><strong>N * O(L) = O(nL)</strong></li>
    </ul>
  </li>
</ul>

<h3>Result Creation:</h3>
<p><strong>O(L)</strong></p>

<h3>Overall Total:</h3>
<p>Dominant term is <strong>O(nL)</strong></p>
