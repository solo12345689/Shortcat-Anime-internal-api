.class public Lgh/e;
.super Ljava/lang/Object;

# interfaces
.implements LFg/b;


# static fields
.field public static final d:Lgh/e;

.field public static final e:Lgh/e;

.field public static final f:Lgh/e;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lgh/e;

    .line 2
    .line 3
    const-string v1, "ML-KEM-512"

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/16 v3, 0x100

    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v3}, Lgh/e;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lgh/e;->d:Lgh/e;

    .line 12
    .line 13
    new-instance v0, Lgh/e;

    .line 14
    .line 15
    const-string v1, "ML-KEM-768"

    .line 16
    .line 17
    const/4 v2, 0x3

    .line 18
    invoke-direct {v0, v1, v2, v3}, Lgh/e;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lgh/e;->e:Lgh/e;

    .line 22
    .line 23
    new-instance v0, Lgh/e;

    .line 24
    .line 25
    const-string v1, "ML-KEM-1024"

    .line 26
    .line 27
    const/4 v2, 0x4

    .line 28
    invoke-direct {v0, v1, v2, v3}, Lgh/e;-><init>(Ljava/lang/String;II)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lgh/e;->f:Lgh/e;

    .line 32
    .line 33
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgh/e;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Lgh/e;->b:I

    .line 7
    .line 8
    iput p3, p0, Lgh/e;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a()Lgh/b;
    .locals 2

    .line 1
    new-instance v0, Lgh/b;

    .line 2
    .line 3
    iget v1, p0, Lgh/e;->b:I

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lgh/b;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lgh/e;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
