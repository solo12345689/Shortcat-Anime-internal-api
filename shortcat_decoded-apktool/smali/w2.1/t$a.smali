.class public final Lw2/t$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lw2/g$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw2/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Lw2/F;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lw2/g;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lw2/t$a;->b()Lw2/t;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public b()Lw2/t;
    .locals 2

    .line 1
    new-instance v0, Lw2/t;

    .line 2
    .line 3
    invoke-direct {v0}, Lw2/t;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lw2/t$a;->a:Lw2/F;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lw2/b;->i(Lw2/F;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-object v0
.end method
