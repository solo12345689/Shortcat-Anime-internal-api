.class public final Lf6/l;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf6/l$a;
    }
.end annotation


# instance fields
.field private final a:LC5/a;

.field private final b:Lf6/l$a;


# direct methods
.method public constructor <init>(LC5/a;Lf6/l$a;)V
    .locals 1

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lf6/l;->a:LC5/a;

    .line 10
    .line 11
    iput-object p2, p0, Lf6/l;->b:Lf6/l$a;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()LC5/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/l;->a:LC5/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Lf6/l$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/l;->b:Lf6/l$a;

    .line 2
    .line 3
    return-object v0
.end method
