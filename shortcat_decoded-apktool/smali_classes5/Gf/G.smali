.class public final synthetic LGf/G;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/N;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/N;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LGf/G;->a:Lkotlin/jvm/internal/N;

    .line 5
    .line 6
    iput-boolean p2, p0, LGf/G;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LGf/G;->a:Lkotlin/jvm/internal/N;

    .line 2
    .line 3
    iget-boolean v1, p0, LGf/G;->b:Z

    .line 4
    .line 5
    check-cast p1, LZd/i;

    .line 6
    .line 7
    check-cast p2, LZd/i$b;

    .line 8
    .line 9
    invoke-static {v0, v1, p1, p2}, LGf/I;->a(Lkotlin/jvm/internal/N;ZLZd/i;LZd/i$b;)LZd/i;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
