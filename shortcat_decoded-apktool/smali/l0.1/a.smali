.class public final Ll0/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:Ll0/a;

.field private static final b:Ll0/e;

.field private static final c:Ll0/e;

.field private static final d:Ll0/e;

.field private static final e:Ll0/e;

.field private static final f:Ll0/e;

.field private static final g:Ll0/e;

.field private static final h:Ll0/e$b;

.field private static final i:Ll0/e$b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ll0/a;

    .line 2
    .line 3
    invoke-direct {v0}, Ll0/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ll0/a;->a:Ll0/a;

    .line 7
    .line 8
    new-instance v0, Ll0/f;

    .line 9
    .line 10
    const/high16 v1, -0x40800000    # -1.0f

    .line 11
    .line 12
    invoke-direct {v0, v1, v1}, Ll0/f;-><init>(FF)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Ll0/a;->b:Ll0/e;

    .line 16
    .line 17
    new-instance v0, Ll0/f;

    .line 18
    .line 19
    const/high16 v2, 0x3f800000    # 1.0f

    .line 20
    .line 21
    invoke-direct {v0, v2, v1}, Ll0/f;-><init>(FF)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Ll0/a;->c:Ll0/e;

    .line 25
    .line 26
    new-instance v0, Ll0/f;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-direct {v0, v1, v3}, Ll0/f;-><init>(FF)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Ll0/a;->d:Ll0/e;

    .line 33
    .line 34
    new-instance v0, Ll0/f;

    .line 35
    .line 36
    invoke-direct {v0, v2, v3}, Ll0/f;-><init>(FF)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Ll0/a;->e:Ll0/e;

    .line 40
    .line 41
    new-instance v0, Ll0/f;

    .line 42
    .line 43
    invoke-direct {v0, v1, v2}, Ll0/f;-><init>(FF)V

    .line 44
    .line 45
    .line 46
    sput-object v0, Ll0/a;->f:Ll0/e;

    .line 47
    .line 48
    new-instance v0, Ll0/f;

    .line 49
    .line 50
    invoke-direct {v0, v2, v2}, Ll0/f;-><init>(FF)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Ll0/a;->g:Ll0/e;

    .line 54
    .line 55
    new-instance v0, Ll0/f$a;

    .line 56
    .line 57
    invoke-direct {v0, v1}, Ll0/f$a;-><init>(F)V

    .line 58
    .line 59
    .line 60
    sput-object v0, Ll0/a;->h:Ll0/e$b;

    .line 61
    .line 62
    new-instance v0, Ll0/f$a;

    .line 63
    .line 64
    invoke-direct {v0, v2}, Ll0/f$a;-><init>(F)V

    .line 65
    .line 66
    .line 67
    sput-object v0, Ll0/a;->i:Ll0/e$b;

    .line 68
    .line 69
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()Ll0/e;
    .locals 1

    .line 1
    sget-object v0, Ll0/a;->b:Ll0/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Ll0/e;
    .locals 1

    .line 1
    sget-object v0, Ll0/a;->c:Ll0/e;

    .line 2
    .line 3
    return-object v0
.end method
