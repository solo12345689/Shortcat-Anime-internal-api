.class final LK0/d0$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK0/d0;->d(Landroidx/compose/ui/e;La0/c;La0/c;)La0/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:La0/c;


# direct methods
.method constructor <init>(La0/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK0/d0$a;->a:La0/c;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/e$b;)Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, LK0/d0$a;->a:La0/c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, La0/c;->c(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/e$b;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LK0/d0$a;->a(Landroidx/compose/ui/e$b;)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
