.class final Lyc/a$c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyc/a;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lyc/a;


# direct methods
.method constructor <init>(Lyc/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyc/a$c;->a:Lyc/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    sget-object v0, Lyc/a;->e:Lyc/a$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lyc/a$a;->a()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/Collection;

    .line 8
    .line 9
    iget-object v1, p0, Lyc/a$c;->a:Lyc/a;

    .line 10
    .line 11
    invoke-static {v1}, Lyc/a;->y(Lyc/a;)Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/V;->a(Ljava/lang/Object;)Ljava/util/Collection;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-interface {v0, v1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lyc/a$c;->a()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LTd/L;->a:LTd/L;

    .line 5
    .line 6
    return-object v0
.end method
