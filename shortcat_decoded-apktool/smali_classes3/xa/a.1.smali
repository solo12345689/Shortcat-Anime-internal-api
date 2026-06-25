.class public abstract Lxa/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lxa/D;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxa/a$a;
    }
.end annotation


# instance fields
.field protected a:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lxa/a;->a:I

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method b()Lxa/X;
    .locals 1

    .line 1
    new-instance v0, Lxa/X;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lxa/X;-><init>(Lxa/D;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
