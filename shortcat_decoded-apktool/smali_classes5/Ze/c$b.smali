.class LZe/c$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LZe/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZe/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field private a:I

.field private final b:I

.field final synthetic c:LZe/c;


# direct methods
.method private constructor <init>(LZe/c;)V
    .locals 1

    .line 2
    iput-object p1, p0, LZe/c$b;->c:LZe/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p1}, LZe/c;->F()I

    move-result v0

    iput v0, p0, LZe/c$b;->a:I

    .line 4
    invoke-virtual {p1}, LZe/c;->size()I

    move-result p1

    add-int/2addr v0, p1

    iput v0, p0, LZe/c$b;->b:I

    return-void
.end method

.method synthetic constructor <init>(LZe/c;LZe/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LZe/c$b;-><init>(LZe/c;)V

    return-void
.end method


# virtual methods
.method public a()B
    .locals 3

    .line 1
    iget v0, p0, LZe/c$b;->a:I

    .line 2
    .line 3
    iget v1, p0, LZe/c$b;->b:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, LZe/c$b;->c:LZe/c;

    .line 8
    .line 9
    iget-object v1, v1, LZe/o;->b:[B

    .line 10
    .line 11
    add-int/lit8 v2, v0, 0x1

    .line 12
    .line 13
    iput v2, p0, LZe/c$b;->a:I

    .line 14
    .line 15
    aget-byte v0, v1, v0

    .line 16
    .line 17
    return v0

    .line 18
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 21
    .line 22
    .line 23
    throw v0
.end method

.method public b()Ljava/lang/Byte;
    .locals 1

    .line 1
    invoke-virtual {p0}, LZe/c$b;->a()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, LZe/c$b;->a:I

    .line 2
    .line 3
    iget v1, p0, LZe/c$b;->b:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LZe/c$b;->b()Ljava/lang/Byte;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public remove()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw v0
.end method
