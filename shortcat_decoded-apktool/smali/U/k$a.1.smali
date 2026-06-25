.class final LU/k$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/k;->a(Lie/a;Landroidx/compose/ui/e;ZLs0/E1;LU/h;LU/j;Lx/g;LC/A;LB/m;Lie/o;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:LU/k$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LU/k$a;

    .line 2
    .line 3
    invoke-direct {v0}, LU/k$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LU/k$a;->a:LU/k$a;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LR0/C;

    invoke-virtual {p0, p1}, LU/k$a;->invoke(LR0/C;)V

    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public final invoke(LR0/C;)V
    .locals 1

    .line 2
    sget-object v0, LR0/h;->b:LR0/h$a;

    invoke-virtual {v0}, LR0/h$a;->a()I

    move-result v0

    invoke-static {p1, v0}, LR0/A;->c0(LR0/C;I)V

    return-void
.end method
