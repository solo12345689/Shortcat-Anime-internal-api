.class public final Lx/D;
.super Landroidx/compose/ui/e$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK0/I0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx/D$a;
    }
.end annotation


# static fields
.field public static final c:Lx/D$a;

.field public static final d:I


# instance fields
.field private a:Lkotlin/jvm/functions/Function1;

.field private final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lx/D$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lx/D$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lx/D;->c:Lx/D$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lx/D;->d:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx/D;->a:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    sget-object p1, Lx/D;->c:Lx/D$a;

    .line 7
    .line 8
    iput-object p1, p0, Lx/D;->b:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public B()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lx/D;->b:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final E1(LI0/p;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx/D;->a:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-static {p0}, LK0/J0;->b(LK0/I0;)LK0/I0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Lx/D;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lx/D;->E1(LI0/p;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
