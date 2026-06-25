.class Lrh/c$c;
.super Lrh/c$y;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrh/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
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
    invoke-direct {p0}, Lrh/c$c;-><init>()V

    return-void
.end method


# virtual methods
.method a(LDg/b;Ljava/lang/Object;)LKg/a;
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p1}, LDg/b;->r()Lzg/y;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-static {p2}, LVg/b;->l(Ljava/lang/Object;)LVg/b;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-virtual {p2}, LVg/b;->n()[B

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p1}, LDg/b;->l()LDg/a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, LDg/a;->l()Lzg/t;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Lrh/e;->r(Lzg/t;)LYg/f;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, LYg/h;

    .line 26
    .line 27
    invoke-direct {v1, v0, p2}, LYg/h;-><init>(LYg/f;[B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    return-object v1

    .line 31
    :catch_0
    invoke-virtual {p1}, LDg/b;->p()Lzg/b;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p2}, Lzg/b;->D()[B

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {p1}, LDg/b;->l()LDg/a;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, LDg/a;->l()Lzg/t;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p1}, Lrh/e;->r(Lzg/t;)LYg/f;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    new-instance v0, LYg/h;

    .line 52
    .line 53
    invoke-direct {v0, p1, p2}, LYg/h;-><init>(LYg/f;[B)V

    .line 54
    .line 55
    .line 56
    return-object v0
.end method
