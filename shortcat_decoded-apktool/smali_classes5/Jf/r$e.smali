.class public final LJf/r$e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LJf/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJf/r;->c(LJf/e;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/N;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/N;)V
    .locals 0

    .line 1
    iput-object p1, p0, LJf/r$e;->a:Lkotlin/jvm/internal/N;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public emit(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p2, p0, LJf/r$e;->a:Lkotlin/jvm/internal/N;

    .line 2
    .line 3
    iput-object p1, p2, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    .line 4
    .line 5
    new-instance p1, LKf/a;

    .line 6
    .line 7
    invoke-direct {p1, p0}, LKf/a;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    throw p1
.end method
