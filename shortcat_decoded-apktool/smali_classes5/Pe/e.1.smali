.class final LPe/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lze/c;


# static fields
.field public static final a:LPe/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LPe/e;

    .line 2
    .line 3
    invoke-direct {v0}, LPe/e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LPe/e;->a:LPe/e;

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

.method private final b()Ljava/lang/Void;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v1, "No methods should be called on this descriptor. Only its presence matters"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 1

    .line 1
    invoke-direct {p0}, LPe/e;->b()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    new-instance v0, LTd/k;

    .line 5
    .line 6
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 7
    .line 8
    .line 9
    throw v0
.end method

.method public f()LXe/c;
    .locals 1

    .line 1
    invoke-static {p0}, Lze/c$a;->a(Lze/c;)LXe/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getType()Lqf/S;
    .locals 1

    .line 1
    invoke-direct {p0}, LPe/e;->b()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    new-instance v0, LTd/k;

    .line 5
    .line 6
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 7
    .line 8
    .line 9
    throw v0
.end method

.method public k()Lye/h0;
    .locals 1

    .line 1
    invoke-direct {p0}, LPe/e;->b()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    new-instance v0, LTd/k;

    .line 5
    .line 6
    invoke-direct {v0}, LTd/k;-><init>()V

    .line 7
    .line 8
    .line 9
    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "[EnhancedType]"

    .line 2
    .line 3
    return-object v0
.end method
