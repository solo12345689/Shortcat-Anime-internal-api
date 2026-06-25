.class final Lv4/d$a$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv4/d$a;->b()Lv4/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lv4/d$a;


# direct methods
.method constructor <init>(Lv4/d$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv4/d$a$b;->a:Lv4/d$a;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lv4/d$a$b;->invoke()Ly4/a;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ly4/a;
    .locals 2

    .line 2
    sget-object v0, LL4/s;->a:LL4/s;

    iget-object v1, p0, Lv4/d$a$b;->a:Lv4/d$a;

    invoke-static {v1}, Lv4/d$a;->a(Lv4/d$a;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, LL4/s;->a(Landroid/content/Context;)Ly4/a;

    move-result-object v0

    return-object v0
.end method
