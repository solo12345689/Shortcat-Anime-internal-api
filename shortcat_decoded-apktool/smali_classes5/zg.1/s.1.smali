.class public final Lzg/s;
.super Lzg/y;


# static fields
.field static final b:Lzg/L;


# instance fields
.field private final a:Lzg/l;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lzg/s$a;

    .line 2
    .line 3
    const-class v1, Lzg/s;

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    invoke-direct {v0, v1, v2}, Lzg/s$a;-><init>(Ljava/lang/Class;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lzg/s;->b:Lzg/L;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lzg/l;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lzg/y;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lzg/s;->a:Lzg/l;

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 10
    .line 11
    const-string v0, "\'baseGraphicString\' cannot be null"

    .line 12
    .line 13
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw p1
.end method

.method static y([B)Lzg/s;
    .locals 1

    .line 1
    new-instance v0, Lzg/s;

    .line 2
    .line 3
    invoke-static {p0}, Lzg/l;->y([B)Lzg/l;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {v0, p0}, Lzg/s;-><init>(Lzg/l;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method


# virtual methods
.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lzg/s;->a:Lzg/l;

    .line 2
    .line 3
    invoke-virtual {v0}, Lzg/l;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    not-int v0, v0

    .line 8
    return v0
.end method

.method l(Lzg/y;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lzg/s;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    check-cast p1, Lzg/s;

    .line 8
    .line 9
    iget-object v0, p0, Lzg/s;->a:Lzg/l;

    .line 10
    .line 11
    iget-object p1, p1, Lzg/s;->a:Lzg/l;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lzg/l;->l(Lzg/y;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method n(Lzg/w;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x7

    .line 2
    invoke-virtual {p1, p2, v0}, Lzg/w;->s(ZI)V

    .line 3
    .line 4
    .line 5
    iget-object p2, p0, Lzg/s;->a:Lzg/l;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p2, p1, v0}, Lzg/l;->n(Lzg/w;Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method p()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method t(Z)I
    .locals 1

    .line 1
    iget-object v0, p0, Lzg/s;->a:Lzg/l;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lzg/l;->t(Z)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method w()Lzg/y;
    .locals 2

    .line 1
    iget-object v0, p0, Lzg/s;->a:Lzg/l;

    .line 2
    .line 3
    invoke-virtual {v0}, Lzg/y;->w()Lzg/y;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lzg/l;

    .line 8
    .line 9
    iget-object v1, p0, Lzg/s;->a:Lzg/l;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance v1, Lzg/s;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Lzg/s;-><init>(Lzg/l;)V

    .line 17
    .line 18
    .line 19
    return-object v1
.end method

.method x()Lzg/y;
    .locals 2

    .line 1
    iget-object v0, p0, Lzg/s;->a:Lzg/l;

    .line 2
    .line 3
    invoke-virtual {v0}, Lzg/y;->x()Lzg/y;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lzg/l;

    .line 8
    .line 9
    iget-object v1, p0, Lzg/s;->a:Lzg/l;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance v1, Lzg/s;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Lzg/s;-><init>(Lzg/l;)V

    .line 17
    .line 18
    .line 19
    return-object v1
.end method
