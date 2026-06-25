.class public interface abstract LY4/i;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final a:LY4/i;

.field public static final b:LY4/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LY4/i$a;

    .line 2
    .line 3
    invoke-direct {v0}, LY4/i$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LY4/i;->a:LY4/i;

    .line 7
    .line 8
    new-instance v0, LY4/k$a;

    .line 9
    .line 10
    invoke-direct {v0}, LY4/k$a;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, LY4/k$a;->c()LY4/k;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, LY4/i;->b:LY4/i;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public abstract a()Ljava/util/Map;
.end method
