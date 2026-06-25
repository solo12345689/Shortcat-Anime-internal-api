.class final Le/a$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le/a;->a(ZLie/a;LY/m;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/activity/H;

.field final synthetic b:Landroidx/lifecycle/r;

.field final synthetic c:Le/a$d;


# direct methods
.method constructor <init>(Landroidx/activity/H;Landroidx/lifecycle/r;Le/a$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le/a$b;->a:Landroidx/activity/H;

    .line 2
    .line 3
    iput-object p2, p0, Le/a$b;->b:Landroidx/lifecycle/r;

    .line 4
    .line 5
    iput-object p3, p0, Le/a$b;->c:Le/a$d;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(LY/Y;)LY/X;
    .locals 2

    .line 2
    iget-object p1, p0, Le/a$b;->a:Landroidx/activity/H;

    iget-object v0, p0, Le/a$b;->b:Landroidx/lifecycle/r;

    iget-object v1, p0, Le/a$b;->c:Le/a$d;

    invoke-virtual {p1, v0, v1}, Landroidx/activity/H;->i(Landroidx/lifecycle/r;Landroidx/activity/G;)V

    .line 3
    iget-object p1, p0, Le/a$b;->c:Le/a$d;

    .line 4
    new-instance v0, Le/a$b$a;

    invoke-direct {v0, p1}, Le/a$b$a;-><init>(Le/a$d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY/Y;

    invoke-virtual {p0, p1}, Le/a$b;->invoke(LY/Y;)LY/X;

    move-result-object p1

    return-object p1
.end method
