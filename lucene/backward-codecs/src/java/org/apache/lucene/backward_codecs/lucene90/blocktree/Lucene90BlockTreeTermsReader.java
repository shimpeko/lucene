/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.lucene.backward_codecs.lucene90.blocktree;

import java.io.IOException;
import java.util.Iterator;
import org.apache.lucene.codecs.FieldsProducer;
import org.apache.lucene.codecs.PostingsReaderBase;
import org.apache.lucene.index.SegmentReadState;
import org.apache.lucene.index.Terms;

/**
 * Compatibility wrapper for older bytecode that referenced this package.
 *
 * <p>Delegates all behavior to {@link org.apache.lucene.codecs.lucene90.blocktree
 * .Lucene90BlockTreeTermsReader}.
 *
 * @lucene.experimental
 */
public final class Lucene90BlockTreeTermsReader extends FieldsProducer {

  private final org.apache.lucene.codecs.lucene90.blocktree.Lucene90BlockTreeTermsReader delegate;

  public Lucene90BlockTreeTermsReader(PostingsReaderBase postingsReader, SegmentReadState state)
      throws IOException {
    this.delegate =
        new org.apache.lucene.codecs.lucene90.blocktree.Lucene90BlockTreeTermsReader(
            postingsReader, state);
  }

  @Override
  public void close() throws IOException {
    delegate.close();
  }

  @Override
  public Iterator<String> iterator() {
    return delegate.iterator();
  }

  @Override
  public Terms terms(String field) throws IOException {
    return delegate.terms(field);
  }

  @Override
  public int size() {
    return delegate.size();
  }

  @Override
  public void checkIntegrity() throws IOException {
    delegate.checkIntegrity();
  }

  @Override
  public String toString() {
    return delegate.toString();
  }
}
