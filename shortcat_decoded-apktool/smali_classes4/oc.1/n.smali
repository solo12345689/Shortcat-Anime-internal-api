.class public final Loc/n;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Loc/j;
.implements Loc/e;
.implements Loc/i;


# instance fields
.field private final a:Lexpo/modules/kotlin/jni/JavaScriptTypedArray;


# direct methods
.method public constructor <init>(Lexpo/modules/kotlin/jni/JavaScriptTypedArray;)V
    .locals 1

    .line 1
    const-string v0, "rawArray"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Loc/n;->a:Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public b()Lexpo/modules/kotlin/jni/JavaScriptTypedArray;
    .locals 1

    .line 1
    iget-object v0, p0, Loc/n;->a:Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget-object v0, p0, Loc/n;->a:Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/kotlin/jni/JavaScriptTypedArray;->d()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public e(I)B
    .locals 1

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p0}, Loc/j;->getLength()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ge p1, v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Loc/n;->f(I)B

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {p1}, LTd/B;->b(B)B

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    .line 21
    .line 22
    .line 23
    throw p1
.end method

.method public f(I)B
    .locals 1

    .line 1
    iget-object v0, p0, Loc/n;->a:Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lexpo/modules/kotlin/jni/JavaScriptTypedArray;->readByte(I)B

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Loc/n;->e(I)B

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, LTd/B;->a(B)LTd/B;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public getLength()I
    .locals 1

    .line 1
    iget-object v0, p0, Loc/n;->a:Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/kotlin/jni/JavaScriptTypedArray;->getLength()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    invoke-static {p0}, Loc/e$a;->a(Loc/e;)Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public toDirectBuffer()Ljava/nio/ByteBuffer;
    .locals 1

    .line 1
    iget-object v0, p0, Loc/n;->a:Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/kotlin/jni/JavaScriptTypedArray;->toDirectBuffer()Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public write([BII)V
    .locals 1

    .line 1
    const-string v0, "buffer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Loc/n;->a:Lexpo/modules/kotlin/jni/JavaScriptTypedArray;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2, p3}, Lexpo/modules/kotlin/jni/JavaScriptTypedArray;->write([BII)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
