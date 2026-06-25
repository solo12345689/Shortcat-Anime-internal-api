.class Lrh/c$s;
.super Lrh/c$y;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrh/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "s"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lrh/c$y;-><init>(Lrh/c$a;)V

    return-void
.end method

.method synthetic constructor <init>(Lrh/c$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lrh/c$s;-><init>()V

    return-void
.end method


# virtual methods
.method a(LDg/b;Ljava/lang/Object;)LKg/a;
    .locals 1

    .line 1
    invoke-virtual {p1}, LDg/b;->r()Lzg/y;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-static {p2}, Lzg/B;->A(Ljava/lang/Object;)Lzg/B;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p2, v0}, Lzg/B;->B(I)Lzg/e;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    invoke-static {p2}, Lzg/u;->z(Ljava/lang/Object;)Lzg/u;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-virtual {p2}, Lzg/u;->B()[B

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p1}, LDg/b;->l()LDg/a;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, LDg/a;->l()Lzg/t;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p1}, Lrh/e;->K(Lzg/t;)Lmh/d;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    new-instance v0, Lmh/f;

    .line 35
    .line 36
    invoke-direct {v0, p1, p2}, Lmh/f;-><init>(Lmh/d;[B)V

    .line 37
    .line 38
    .line 39
    return-object v0
.end method
