.class final Lxe/b;
.super Lve/i;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxe/b$a;
    }
.end annotation


# static fields
.field public static final h:Lxe/b$a;

.field private static final i:Lve/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lxe/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lxe/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lxe/b;->h:Lxe/b$a;

    .line 8
    .line 9
    new-instance v0, Lxe/b;

    .line 10
    .line 11
    invoke-direct {v0}, Lxe/b;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lxe/b;->i:Lve/i;

    .line 15
    .line 16
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    new-instance v0, Lpf/f;

    .line 2
    .line 3
    const-string v1, "FallbackBuiltIns"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lpf/f;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, Lve/i;-><init>(Lpf/n;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-virtual {p0, v0}, Lve/i;->f(Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static final synthetic G0()Lve/i;
    .locals 1

    .line 1
    sget-object v0, Lxe/b;->i:Lve/i;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method protected H0()LAe/c$a;
    .locals 1

    .line 1
    sget-object v0, LAe/c$a;->a:LAe/c$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic N()LAe/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lxe/b;->H0()LAe/c$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
