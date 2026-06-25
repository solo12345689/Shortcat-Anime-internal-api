.class public final LG/D$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Li1/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LG/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:F

.field private final b:F


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x3f800000    # 1.0f

    .line 5
    .line 6
    iput v0, p0, LG/D$b;->a:F

    .line 7
    .line 8
    iput v0, p0, LG/D$b;->b:F

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public getDensity()F
    .locals 1

    .line 1
    iget v0, p0, LG/D$b;->a:F

    .line 2
    .line 3
    return v0
.end method

.method public j1()F
    .locals 1

    .line 1
    iget v0, p0, LG/D$b;->b:F

    .line 2
    .line 3
    return v0
.end method
