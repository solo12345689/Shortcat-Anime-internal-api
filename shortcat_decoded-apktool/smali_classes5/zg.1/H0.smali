.class public Lzg/H0;
.super Ljava/lang/Object;

# interfaces
.implements Lzg/e;
.implements Lzg/L0;


# instance fields
.field private a:Lzg/D;


# direct methods
.method constructor <init>(Lzg/D;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzg/H0;->a:Lzg/D;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public d()Lzg/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lzg/H0;->a:Lzg/D;

    .line 2
    .line 3
    invoke-virtual {v0}, Lzg/D;->h()Lzg/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lzg/C0;->b(Lzg/f;)Lzg/G0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public e()Lzg/y;
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lzg/H0;->d()Lzg/y;

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
    move-result-object v2

    .line 13
    invoke-direct {v1, v2, v0}, Lzg/x;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 14
    .line 15
    .line 16
    throw v1
.end method
