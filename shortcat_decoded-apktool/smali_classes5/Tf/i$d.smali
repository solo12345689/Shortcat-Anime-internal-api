.class public final LTf/i$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lje/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LTf/i;->b(LTf/e;)Ljava/lang/Iterable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LTf/e;


# direct methods
.method public constructor <init>(LTf/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LTf/i$d;->a:LTf/e;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    new-instance v0, LTf/i$b;

    .line 2
    .line 3
    iget-object v1, p0, LTf/i$d;->a:LTf/e;

    .line 4
    .line 5
    invoke-direct {v0, v1}, LTf/i$b;-><init>(LTf/e;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
