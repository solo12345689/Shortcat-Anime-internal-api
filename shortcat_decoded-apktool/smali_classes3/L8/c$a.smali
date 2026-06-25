.class public final LL8/c$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LL8/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/util/List;

.field private b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LL8/c$a;->a:Ljava/util/List;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, LL8/c$a;->b:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a()LL8/c;
    .locals 3

    .line 1
    new-instance v0, LL8/c;

    .line 2
    .line 3
    iget-object v1, p0, LL8/c$a;->a:Ljava/util/List;

    .line 4
    .line 5
    iget-boolean v2, p0, LL8/c$a;->b:Z

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, LL8/c;-><init>(Ljava/util/List;Z)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public b(Ljava/util/List;)LL8/c$a;
    .locals 1

    .line 1
    const-string v0, "Keys cannot be set to null"

    .line 2
    .line 3
    invoke-static {p1, v0}, LR8/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LL8/c$a;->a:Ljava/util/List;

    .line 7
    .line 8
    return-object p0
.end method
