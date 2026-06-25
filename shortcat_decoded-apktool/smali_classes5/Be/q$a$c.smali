.class LBe/q$a$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


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
    iput-object p1, p0, LBe/q$a$c;->b:LBe/q$a;

    .line 2
    .line 3
    iput-object p2, p0, LBe/q$a$c;->a:LBe/q;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a()Ljava/util/Collection;
    .locals 1

    .line 1
    iget-object v0, p0, LBe/q$a$c;->b:LBe/q$a;

    .line 2
    .line 3
    invoke-static {v0}, LBe/q$a;->k(LBe/q$a;)Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LBe/q$a$c;->a()Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
