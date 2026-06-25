.class Lzg/a0;
.super Ljava/lang/Object;

# interfaces
.implements Lzg/e;
.implements Lzg/L0;


# instance fields
.field final a:I

.field final b:I

.field final c:Lzg/D;


# direct methods
.method constructor <init>(IILzg/D;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lzg/a0;->a:I

    .line 5
    .line 6
    iput p2, p0, Lzg/a0;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Lzg/a0;->c:Lzg/D;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public d()Lzg/y;
    .locals 3

    .line 1
    iget-object v0, p0, Lzg/a0;->c:Lzg/D;

    .line 2
    .line 3
    iget v1, p0, Lzg/a0;->a:I

    .line 4
    .line 5
    iget v2, p0, Lzg/a0;->b:I

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lzg/D;->c(II)Lzg/y;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public e()Lzg/y;
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lzg/a0;->d()Lzg/y;

    .line 2
    .line 3
    .line 4
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object v0

    .line 6
    :catch_0
    move-exception v0

    .line 7
    new-instance v1, Lzg/x;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-direct {v1, v0}, Lzg/x;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw v1
.end method
