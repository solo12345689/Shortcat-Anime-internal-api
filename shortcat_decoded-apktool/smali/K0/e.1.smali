.class final LK0/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Landroidx/compose/ui/focus/i;


# static fields
.field public static final a:LK0/e;

.field private static b:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LK0/e;

    .line 2
    .line 3
    invoke-direct {v0}, LK0/e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LK0/e;->a:LK0/e;

    .line 7
    .line 8
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
.method public g(Z)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sput-object p1, LK0/e;->b:Ljava/lang/Boolean;

    .line 6
    .line 7
    return-void
.end method

.method public i()Z
    .locals 1

    .line 1
    sget-object v0, LK0/e;->b:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const-string v0, "canFocus is read before it is written"

    .line 11
    .line 12
    invoke-static {v0}, LH0/a;->c(Ljava/lang/String;)Ljava/lang/Void;

    .line 13
    .line 14
    .line 15
    new-instance v0, LTd/k;

    .line 16
    .line 17
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 18
    .line 19
    .line 20
    throw v0
.end method

.method public final o()Z
    .locals 1

    .line 1
    sget-object v0, LK0/e;->b:Ljava/lang/Boolean;

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

.method public final p()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    sput-object v0, LK0/e;->b:Ljava/lang/Boolean;

    .line 3
    .line 4
    return-void
.end method
