.class public final LJ2/j;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LJ2/q$b;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:LO9/t;

.field private final d:LO9/t;

.field private e:I

.field private f:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, LJ2/j;->e:I

    .line 3
    iput-boolean v0, p0, LJ2/j;->f:Z

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, LJ2/j;->b:Landroid/content/Context;

    .line 5
    iput-object v0, p0, LJ2/j;->c:LO9/t;

    .line 6
    iput-object v0, p0, LJ2/j;->d:LO9/t;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, p1, v0, v0}, LJ2/j;-><init>(Landroid/content/Context;LO9/t;LO9/t;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LO9/t;LO9/t;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, LJ2/j;->b:Landroid/content/Context;

    const/4 p1, 0x0

    .line 10
    iput p1, p0, LJ2/j;->e:I

    .line 11
    iput-boolean p1, p0, LJ2/j;->f:Z

    .line 12
    iput-object p2, p0, LJ2/j;->c:LO9/t;

    .line 13
    iput-object p3, p0, LJ2/j;->d:LO9/t;

    return-void
.end method

.method private d()Z
    .locals 4

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-lt v0, v1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    iget-object v1, p0, LJ2/j;->b:Landroid/content/Context;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    const/16 v3, 0x1c

    .line 14
    .line 15
    if-lt v0, v3, :cond_1

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "com.amazon.hardware.tv_screen"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    return v2

    .line 30
    :cond_1
    const/4 v0, 0x0

    .line 31
    return v0
.end method


# virtual methods
.method public b(LJ2/q$a;)LJ2/q;
    .locals 3

    .line 1
    iget v0, p0, LJ2/j;->e:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-direct {p0}, LJ2/j;->d()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance v0, LJ2/P$b;

    .line 16
    .line 17
    invoke-direct {v0}, LJ2/P$b;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, LJ2/P$b;->b(LJ2/q$a;)LJ2/q;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :cond_1
    :goto_0
    iget-object v0, p1, LJ2/q$a;->c:Lq2/x;

    .line 26
    .line 27
    iget-object v0, v0, Lq2/x;->o:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v0}, Lq2/K;->k(Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v2, "Creating an asynchronous MediaCodec adapter for track type "

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Lt2/a0;->x0(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const-string v2, "DMCodecAdapterFactory"

    .line 55
    .line 56
    invoke-static {v2, v1}, Lt2/w;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, LJ2/j;->c:LO9/t;

    .line 60
    .line 61
    if-eqz v1, :cond_2

    .line 62
    .line 63
    iget-object v2, p0, LJ2/j;->d:LO9/t;

    .line 64
    .line 65
    if-eqz v2, :cond_2

    .line 66
    .line 67
    new-instance v0, LJ2/c$b;

    .line 68
    .line 69
    invoke-direct {v0, v1, v2}, LJ2/c$b;-><init>(LO9/t;LO9/t;)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    new-instance v1, LJ2/c$b;

    .line 74
    .line 75
    invoke-direct {v1, v0}, LJ2/c$b;-><init>(I)V

    .line 76
    .line 77
    .line 78
    move-object v0, v1

    .line 79
    :goto_1
    iget-boolean v1, p0, LJ2/j;->f:Z

    .line 80
    .line 81
    invoke-virtual {v0, v1}, LJ2/c$b;->f(Z)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, p1}, LJ2/c$b;->e(LJ2/q$a;)LJ2/c;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    return-object p1
.end method

.method public c()LJ2/j;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, LJ2/j;->e:I

    .line 3
    .line 4
    return-object p0
.end method
