.class public final Lq2/P$b$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq2/P$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field private static final b:[I


# instance fields
.field private final a:Lq2/t$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x23

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lq2/P$b$a;->b:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x7
        0x8
        0x9
        0xa
        0xb
        0xc
        0xd
        0xe
        0xf
        0x10
        0x11
        0x12
        0x13
        0x1f
        0x14
        0x15
        0x16
        0x17
        0x18
        0x19
        0x21
        0x1a
        0x22
        0x23
        0x1b
        0x1c
        0x1d
        0x1e
        0x20
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lq2/t$b;

    invoke-direct {v0}, Lq2/t$b;-><init>()V

    iput-object v0, p0, Lq2/P$b$a;->a:Lq2/t$b;

    return-void
.end method

.method private constructor <init>(Lq2/P$b;)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v0, Lq2/t$b;

    invoke-direct {v0}, Lq2/t$b;-><init>()V

    iput-object v0, p0, Lq2/P$b$a;->a:Lq2/t$b;

    .line 6
    invoke-static {p1}, Lq2/P$b;->a(Lq2/P$b;)Lq2/t;

    move-result-object p1

    invoke-virtual {v0, p1}, Lq2/t$b;->b(Lq2/t;)Lq2/t$b;

    return-void
.end method

.method synthetic constructor <init>(Lq2/P$b;Lq2/P$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lq2/P$b$a;-><init>(Lq2/P$b;)V

    return-void
.end method


# virtual methods
.method public a(I)Lq2/P$b$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lq2/P$b$a;->a:Lq2/t$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lq2/t$b;->a(I)Lq2/t$b;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public b(Lq2/P$b;)Lq2/P$b$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lq2/P$b$a;->a:Lq2/t$b;

    .line 2
    .line 3
    invoke-static {p1}, Lq2/P$b;->a(Lq2/P$b;)Lq2/t;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Lq2/t$b;->b(Lq2/t;)Lq2/t$b;

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public varargs c([I)Lq2/P$b$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lq2/P$b$a;->a:Lq2/t$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lq2/t$b;->c([I)Lq2/t$b;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public d()Lq2/P$b$a;
    .locals 2

    .line 1
    iget-object v0, p0, Lq2/P$b$a;->a:Lq2/t$b;

    .line 2
    .line 3
    sget-object v1, Lq2/P$b$a;->b:[I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lq2/t$b;->c([I)Lq2/t$b;

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public e(IZ)Lq2/P$b$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lq2/P$b$a;->a:Lq2/t$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lq2/t$b;->d(IZ)Lq2/t$b;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public f()Lq2/P$b;
    .locals 3

    .line 1
    new-instance v0, Lq2/P$b;

    .line 2
    .line 3
    iget-object v1, p0, Lq2/P$b$a;->a:Lq2/t$b;

    .line 4
    .line 5
    invoke-virtual {v1}, Lq2/t$b;->e()Lq2/t;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v0, v1, v2}, Lq2/P$b;-><init>(Lq2/t;Lq2/P$a;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
