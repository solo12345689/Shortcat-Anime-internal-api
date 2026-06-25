.class LBe/q$a$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LBe/q$a;-><init>(LBe/q;Lpf/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LBe/q;

.field final synthetic b:LBe/q$a;


# direct methods
.method constructor <init>(LBe/q$a;LBe/q;)V
    .locals 0

    .line 1
    iput-object p1, p0, LBe/q$a$b;->b:LBe/q$a;

    .line 2
    .line 3
    iput-object p2, p0, LBe/q$a$b;->a:LBe/q;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(LXe/f;)Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, LBe/q$a$b;->b:LBe/q$a;

    .line 2
    .line 3
    invoke-static {v0, p1}, LBe/q$a;->j(LBe/q$a;LXe/f;)Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LXe/f;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LBe/q$a$b;->a(LXe/f;)Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
