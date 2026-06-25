.class public final LK0/l0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK0/q0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK0/l0$b;
    }
.end annotation


# static fields
.field public static final b:LK0/l0$b;

.field public static final c:I

.field private static final d:Lkotlin/jvm/functions/Function1;


# instance fields
.field private final a:LK0/j0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LK0/l0$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LK0/l0$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LK0/l0;->b:LK0/l0$b;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, LK0/l0;->c:I

    .line 12
    .line 13
    sget-object v0, LK0/l0$a;->a:LK0/l0$a;

    .line 14
    .line 15
    sput-object v0, LK0/l0;->d:Lkotlin/jvm/functions/Function1;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(LK0/j0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LK0/l0;->a:LK0/j0;

    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic a()Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    sget-object v0, LK0/l0;->d:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public J0()Z
    .locals 1

    .line 1
    iget-object v0, p0, LK0/l0;->a:LK0/j0;

    .line 2
    .line 3
    invoke-interface {v0}, LK0/j;->getNode()Landroidx/compose/ui/e$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroidx/compose/ui/e$c;->isAttached()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final b()LK0/j0;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/l0;->a:LK0/j0;

    .line 2
    .line 3
    return-object v0
.end method
