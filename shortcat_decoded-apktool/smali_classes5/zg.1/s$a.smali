.class final Lzg/s$a;
.super Lzg/L;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzg/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Class;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lzg/L;-><init>(Ljava/lang/Class;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method c(Lzg/B;)Lzg/y;
    .locals 2

    .line 1
    new-instance v0, Lzg/s;

    .line 2
    .line 3
    sget-object v1, Lzg/l;->b:Lzg/L;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Lzg/L;->c(Lzg/B;)Lzg/y;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lzg/l;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Lzg/s;-><init>(Lzg/l;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method d(Lzg/n0;)Lzg/y;
    .locals 2

    .line 1
    new-instance v0, Lzg/s;

    .line 2
    .line 3
    sget-object v1, Lzg/l;->b:Lzg/L;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Lzg/L;->d(Lzg/n0;)Lzg/y;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lzg/l;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Lzg/s;-><init>(Lzg/l;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
