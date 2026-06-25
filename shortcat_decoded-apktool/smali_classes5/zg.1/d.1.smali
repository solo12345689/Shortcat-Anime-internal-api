.class public Lzg/d;
.super Lzg/y;


# static fields
.field static final b:Lzg/L;

.field public static final c:Lzg/d;

.field public static final d:Lzg/d;


# instance fields
.field private final a:B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lzg/d$a;

    .line 2
    .line 3
    const-class v1, Lzg/d;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v0, v1, v2}, Lzg/d$a;-><init>(Ljava/lang/Class;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lzg/d;->b:Lzg/L;

    .line 10
    .line 11
    new-instance v0, Lzg/d;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, v1}, Lzg/d;-><init>(B)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lzg/d;->c:Lzg/d;

    .line 18
    .line 19
    new-instance v0, Lzg/d;

    .line 20
    .line 21
    const/4 v1, -0x1

    .line 22
    invoke-direct {v0, v1}, Lzg/d;-><init>(B)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lzg/d;->d:Lzg/d;

    .line 26
    .line 27
    return-void
.end method

.method private constructor <init>(B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lzg/y;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-byte p1, p0, Lzg/d;->a:B

    .line 5
    .line 6
    return-void
.end method

.method static y([B)Lzg/d;
    .locals 2

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ne v0, v1, :cond_2

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    aget-byte p0, p0, v0

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    if-eq p0, v0, :cond_1

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lzg/d;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Lzg/d;-><init>(B)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    sget-object p0, Lzg/d;->c:Lzg/d;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    sget-object p0, Lzg/d;->d:Lzg/d;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 26
    .line 27
    const-string v0, "BOOLEAN value should have 1 byte in it"

    .line 28
    .line 29
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p0
.end method


# virtual methods
.method public hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lzg/d;->z()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method l(Lzg/y;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lzg/d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Lzg/d;

    .line 8
    .line 9
    invoke-virtual {p0}, Lzg/d;->z()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p1}, Lzg/d;->z()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-ne v0, p1, :cond_1

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    return p1

    .line 21
    :cond_1
    return v1
.end method

.method n(Lzg/w;Z)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-byte v1, p0, Lzg/d;->a:B

    .line 3
    .line 4
    invoke-virtual {p1, p2, v0, v1}, Lzg/w;->m(ZIB)V

    .line 5
    .line 6
    .line 7
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
    const/4 v0, 0x1

    .line 2
    invoke-static {p1, v0}, Lzg/w;->g(ZI)I

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lzg/d;->z()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "TRUE"

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const-string v0, "FALSE"

    .line 11
    .line 12
    return-object v0
.end method

.method w()Lzg/y;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lzg/d;->z()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lzg/d;->d:Lzg/d;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    sget-object v0, Lzg/d;->c:Lzg/d;

    .line 11
    .line 12
    return-object v0
.end method

.method public z()Z
    .locals 1

    .line 1
    iget-byte v0, p0, Lzg/d;->a:B

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method
