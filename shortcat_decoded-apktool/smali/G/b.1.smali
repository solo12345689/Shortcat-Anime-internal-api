.class final LG/b;
.super LG/C;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LG/b$c;
    }
.end annotation


# static fields
.field public static final L:LG/b$c;

.field private static final M:Lh0/v;


# instance fields
.field private K:LY/C0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LG/b$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LG/b$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LG/b;->L:LG/b$c;

    .line 8
    .line 9
    sget-object v0, LG/b$a;->a:LG/b$a;

    .line 10
    .line 11
    sget-object v1, LG/b$b;->a:LG/b$b;

    .line 12
    .line 13
    invoke-static {v0, v1}, Lh0/b;->b(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Lh0/v;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, LG/b;->M:Lh0/v;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(IFLie/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LG/C;-><init>(IF)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    const/4 p2, 0x2

    .line 6
    invoke-static {p3, p1, p2, p1}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, LG/b;->K:LY/C0;

    .line 11
    .line 12
    return-void
.end method

.method public static final synthetic l0()Lh0/v;
    .locals 1

    .line 1
    sget-object v0, LG/b;->M:Lh0/v;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public F()I
    .locals 1

    .line 1
    iget-object v0, p0, LG/b;->K:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/C0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lie/a;

    .line 8
    .line 9
    invoke-interface {v0}, Lie/a;->invoke()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public final m0()LY/C0;
    .locals 1

    .line 1
    iget-object v0, p0, LG/b;->K:LY/C0;

    .line 2
    .line 3
    return-object v0
.end method
