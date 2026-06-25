.class public Lfh/c;
.super Ljava/lang/Object;


# static fields
.field public static final d:Lfh/c;

.field public static final e:Lfh/c;

.field public static final f:Lfh/c;

.field public static final g:Lfh/c;

.field public static final h:Lfh/c;

.field public static final i:Lfh/c;


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lfh/c;

    .line 2
    .line 3
    const-string v1, "ml-dsa-44"

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-direct {v0, v1, v2, v3}, Lfh/c;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lfh/c;->d:Lfh/c;

    .line 11
    .line 12
    new-instance v0, Lfh/c;

    .line 13
    .line 14
    const-string v1, "ml-dsa-65"

    .line 15
    .line 16
    const/4 v4, 0x3

    .line 17
    invoke-direct {v0, v1, v4, v3}, Lfh/c;-><init>(Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lfh/c;->e:Lfh/c;

    .line 21
    .line 22
    new-instance v0, Lfh/c;

    .line 23
    .line 24
    const-string v1, "ml-dsa-87"

    .line 25
    .line 26
    const/4 v5, 0x5

    .line 27
    invoke-direct {v0, v1, v5, v3}, Lfh/c;-><init>(Ljava/lang/String;II)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lfh/c;->f:Lfh/c;

    .line 31
    .line 32
    new-instance v0, Lfh/c;

    .line 33
    .line 34
    const-string v1, "ml-dsa-44-with-sha512"

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    invoke-direct {v0, v1, v2, v3}, Lfh/c;-><init>(Ljava/lang/String;II)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lfh/c;->g:Lfh/c;

    .line 41
    .line 42
    new-instance v0, Lfh/c;

    .line 43
    .line 44
    const-string v1, "ml-dsa-65-with-sha512"

    .line 45
    .line 46
    invoke-direct {v0, v1, v4, v3}, Lfh/c;-><init>(Ljava/lang/String;II)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lfh/c;->h:Lfh/c;

    .line 50
    .line 51
    new-instance v0, Lfh/c;

    .line 52
    .line 53
    const-string v1, "ml-dsa-87-with-sha512"

    .line 54
    .line 55
    invoke-direct {v0, v1, v5, v3}, Lfh/c;-><init>(Ljava/lang/String;II)V

    .line 56
    .line 57
    .line 58
    sput-object v0, Lfh/c;->i:Lfh/c;

    .line 59
    .line 60
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfh/c;->b:Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, Lfh/c;->a:I

    .line 7
    .line 8
    iput p3, p0, Lfh/c;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method a(Ljava/security/SecureRandom;)Lfh/a;
    .locals 2

    .line 1
    new-instance v0, Lfh/a;

    .line 2
    .line 3
    iget v1, p0, Lfh/c;->a:I

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, Lfh/a;-><init>(ILjava/security/SecureRandom;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lfh/c;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
