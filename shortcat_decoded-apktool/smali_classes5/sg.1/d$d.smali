.class public abstract Lsg/d$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsg/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "d"
.end annotation


# instance fields
.field private final a:Z

.field private final b:Ltg/j;

.field private final c:Ltg/i;


# direct methods
.method public constructor <init>(ZLtg/j;Ltg/i;)V
    .locals 1

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "sink"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-boolean p1, p0, Lsg/d$d;->a:Z

    .line 15
    .line 16
    iput-object p2, p0, Lsg/d$d;->b:Ltg/j;

    .line 17
    .line 18
    iput-object p3, p0, Lsg/d$d;->c:Ltg/i;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lsg/d$d;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public final b()Ltg/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lsg/d$d;->c:Ltg/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Ltg/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lsg/d$d;->b:Ltg/j;

    .line 2
    .line 3
    return-object v0
.end method
