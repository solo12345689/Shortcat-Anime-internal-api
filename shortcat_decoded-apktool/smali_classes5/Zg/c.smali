.class public LZg/c;
.super Ljava/lang/Object;


# static fields
.field public static final d:LZg/c;

.field public static final e:LZg/c;

.field public static final f:LZg/c;


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LZg/c;

    .line 2
    .line 3
    const-string v1, "dilithium2"

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-direct {v0, v1, v2, v3}, LZg/c;-><init>(Ljava/lang/String;IZ)V

    .line 8
    .line 9
    .line 10
    sput-object v0, LZg/c;->d:LZg/c;

    .line 11
    .line 12
    new-instance v0, LZg/c;

    .line 13
    .line 14
    const-string v1, "dilithium3"

    .line 15
    .line 16
    const/4 v2, 0x3

    .line 17
    invoke-direct {v0, v1, v2, v3}, LZg/c;-><init>(Ljava/lang/String;IZ)V

    .line 18
    .line 19
    .line 20
    sput-object v0, LZg/c;->e:LZg/c;

    .line 21
    .line 22
    new-instance v0, LZg/c;

    .line 23
    .line 24
    const-string v1, "dilithium5"

    .line 25
    .line 26
    const/4 v2, 0x5

    .line 27
    invoke-direct {v0, v1, v2, v3}, LZg/c;-><init>(Ljava/lang/String;IZ)V

    .line 28
    .line 29
    .line 30
    sput-object v0, LZg/c;->f:LZg/c;

    .line 31
    .line 32
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LZg/c;->b:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, LZg/c;->a:I

    .line 7
    .line 8
    iput-boolean p3, p0, LZg/c;->c:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method a(Ljava/security/SecureRandom;)LZg/a;
    .locals 3

    .line 1
    new-instance v0, LZg/a;

    .line 2
    .line 3
    iget v1, p0, LZg/c;->a:I

    .line 4
    .line 5
    iget-boolean v2, p0, LZg/c;->c:Z

    .line 6
    .line 7
    invoke-direct {v0, v1, p1, v2}, LZg/a;-><init>(ILjava/security/SecureRandom;Z)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LZg/c;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
