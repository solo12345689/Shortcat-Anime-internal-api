.class public abstract LJ3/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ3/a$a;,
        LJ3/a$b;
    }
.end annotation


# static fields
.field public static final a:LJ3/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LJ3/a$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LJ3/a$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LJ3/a;->a:LJ3/a$b;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final a(Landroid/content/Context;)LJ3/a;
    .locals 1

    .line 1
    sget-object v0, LJ3/a;->a:LJ3/a$b;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, LJ3/a$b;->a(Landroid/content/Context;)LJ3/a;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public abstract b()Lcom/google/common/util/concurrent/p;
.end method

.method public abstract c(Landroid/net/Uri;)Lcom/google/common/util/concurrent/p;
.end method
